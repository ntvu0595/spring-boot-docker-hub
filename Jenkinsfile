node {
    def app
    def remote = [:]
      remote.name = '192.168.1.139'
      remote.host = '192.168.1.139'
      remote.user = 'root'
      remote.password = '4b@SDh^g-P'
      remote.allowAnyHosts = true

      def DOCKER_REPO="ntvu0595/spring-boot-docker-hub"

//     def jenkinsVar = readProperties  file: './Jenkins.properties'

    stage('Clone repository') {
        echo '$DOCKER_REPO'
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }
    stage('Build Specs OPENAPI') {
        bat 'mvn clean install'
    }
    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */
        bat 'docker build -t %DOCKER_REPO%:latest .'
    }
    stage("Push image") {
        withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
//              sh 'docker login --username $DOCKER_USERNAME --password-stdin docker.io' //linux
            bat 'docker login -u %DOCKER_USERNAME% -p %DOCKER_PASSWORD% docker.io' //windows
            bat 'docker push %DOCKER_REPO%:latest'
        }
        bat "docker image rm %DOCKER_REPO%:latest"
     }
    stage('Remote SSH') {
        sshCommand remote: remote, command: 'sudo docker login -u ntvu0595 -p Nguyen1995 docker.io'
        sshCommand remote: remote, command: 'sudo docker ps'
        sshCommand remote: remote, command: 'sudo docker stop $(docker ps -a -q --filter ancestor=ntvu0595/spring-boot-docker-hub --format="{{.ID}}")'
        sshCommand remote: remote, command: 'sudo docker pull ntvu0595/spring-boot-docker-hub:latest'
        sshCommand remote: remote, command: 'sudo docker run -d --rm -p9010:8080 ntvu0595/spring-boot-docker-hub:latest -f'
    }
}