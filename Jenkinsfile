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
        withCredentials([sshUserPrivateKey(credentialsId: '', keyFileVariable: 'AAAAB3NzaC1yc2EAAAADAQABAAABAQDMmjdNZb4rAi5A5UACdPvzy/nLvOhrWTjFm7m/yLjWRgSvMJc62xjwLMCadpKF5HcBOmDyLzONhmmn9GHXb/Uau8InFIb9WMR/QbdjDYV+Bt39cTVPlP/NNwbRPP5fRU+LiYz19Qsngs8rs86R8vf9N4Wr9L7Au5zG+jObx87hX1dScqB2oU06c2Cdf4P0YiMrY2QzKeZDoSDBjG307nOl7ZxpXc0ghzST1dyRI5olLirXddPpYaHpf28eZ2q6jS2d9ZLZOGSuYNZUXfwhs3m80SHSwhbyMbRwaItc1Qzu2MPphmi1kvyUtqSbMDL2UzPjvf4GYabpJWDZ7iyfUe1j')]) {
            sh 'sudo docker images'
        }
    }
}