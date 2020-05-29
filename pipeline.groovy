#!groovy
pipeline {
   agent any
   stages {
      stage("first_springboot") {
         steps {
            sh '''
            ls -l
            rm -rf first_springboot
            ls -l
            if ! [ -d first_springboot ]; then git clone https://github.com/pedrohso90/first_springboot.git; fi
            cd first_springboot
            mvn sonar:sonar -Dsonar.host.url=http://sonar:9000 -Dsonar.login=
            mvn install
            docker build -t first_springboot:$TAG .
            docker run -d first_springboot:$TAG
            '''
         }
      }
   }
}