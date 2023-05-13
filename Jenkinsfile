node {
    def app
    def remote = [:]
      remote.name = '192.168.1.139'
      remote.host = '192.168.1.139'
      remote.user = 'root'
      remote.password = '4b@SDh^g-P'
      remote.allowAnyHosts = true

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }
//     stage('Build Specs OPENAPI') {
//         bat 'mvn clean install'
//     }
    stage("build") {
          withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
            echo "docker login --username ${DOCKER_USERNAME} --password Nguyen1995"
            bat 'docker login --username %DOCKER_USERNAME% --password %DOCKER_PASSWORD%'
          }
        }
//     stage('Build image') {
//         /* This builds the actual image; synonymous to
//          * docker build on the command line */
//
//         bat 'docker build -t ntvu0595/spring-boot-docker-hub .'
//     }
//     stage('Push image') {
//         bat 'docker push ntvu0595/spring-boot-docker-hub'
//     }
//     stage('Remote SSH') {
//         sshCommand remote: remote, command: 'sudo docker login -u ntvu0595 -p Nguyen1995 docker.io'
//         sshCommand remote: remote, command: 'sudo docker ps'
//         sshCommand remote: remote, command: 'sudo docker stop $(docker ps -a -q --filter ancestor=ntvu0595/spring-boot-docker-hub --format="{{.ID}}")'
//         sshCommand remote: remote, command: 'sudo docker pull ntvu0595/spring-boot-docker-hub'
//         sshCommand remote: remote, command: 'sudo docker run -d --rm -p9010:8080 ntvu0595/spring-boot-docker-hub:latest -f'
//     }
}