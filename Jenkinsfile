node {
    def app
    def remote = [:]
      remote.name = '192.168.1.139'
      remote.host = '192.168.1.139'
      remote.user = 'root'
      remote.password = '4b@SDh^g-P'
      remote.allowAnyHosts = true

    def dockerImage = 'ntvu0595/spring-boot-docker-hub'

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }
    stage('Build Specs OPENAPI') {
        bat 'mvn clean install'
    }
    stage("Docker login") {
          withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
//              sh 'docker login --username $DOCKER_USERNAME --password-stdin docker.io' //linux
            bat 'docker login --username %DOCKER_USERNAME% --password-stdin docker.io' //windows
          }
     }
    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        bat 'docker build -t %dockerImage% .'
    }
    stage('Push image') {
        bat 'docker push %dockerImage%'
    }
    withCredentials([usernamePassword(credentialsId: '112b4a2a-a9d3-4fc7-a698-b319c22c1ee7', passwordVariable: 'SERVER_PASSWORD', usernameVariable: 'SERVER_USERNAME')]) {
        // some block
        sh 'sudo docker ps'
    }
//     stage('Remote SSH') {
//         sshCommand remote: remote, command: 'sudo docker login -u ntvu0595 -p Nguyen1995 docker.io'
//         sshCommand remote: remote, command: 'sudo docker ps'
//         sshCommand remote: remote, command: 'sudo docker stop $(docker ps -a -q --filter ancestor=ntvu0595/spring-boot-docker-hub --format="{{.ID}}")'
//         sshCommand remote: remote, command: 'sudo docker pull ntvu0595/spring-boot-docker-hub'
//         sshCommand remote: remote, command: 'sudo docker run -d --rm -p9010:8080 ntvu0595/spring-boot-docker-hub:latest -f'
//     }
}