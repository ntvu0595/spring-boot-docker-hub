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
    stage('Remote SSH') {
        sshCommand remote: remote, command: "ls -lrt"
        sshCommand remote: remote, command: "for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done"
    }
}