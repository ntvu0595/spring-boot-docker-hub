node {
    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }
    stage('Build Specs OPENAPI') {
        bat 'mvn clean install'
    }
    stage('Login docker') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        bat 'docker login -u ntvu0595 -p Nguyen1995 docker.io'
    }
    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        bat 'docker build -t ntvu0595/spring-boot-docker-hub .'
    }
    stage('Push image') {
            bat 'docker push ntvu0595/spring-boot-docker-hub'
    }
    stage('Connect server') {
        withCredentials([usernameColonPassword(credentialsId: '112b4a2a-a9d3-4fc7-a698-b319c22c1ee7', variable: 'host-centos')]) {
            sh 'sudo docker images'
        }
    }
}