node {
    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }
    stage('Build Specs OPENAPI') {
        bat 'mvn clean install'
    }

    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        app = docker.build("ntvu0595/spring-boot-docker-hub")
    }
}