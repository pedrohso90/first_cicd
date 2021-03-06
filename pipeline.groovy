#!groovy
pipeline {
   agent any
   stages {
      stage("first_springboot") {
         steps {
            sh '''
            rm -rf first_springboot
            if ! [ -d first_springboot ]; then git clone https://github.com/pedrohso90/first_springboot.git; fi
            cd first_springboot
            mvn sonar:sonar -Dsonar.host.url=http://sonar:9000 -Dsonar.login=f111ece43bd3de6cd28f9ca595dc33a23ac19b5e
            mvn install
            docker build -t first_springboot:$TAG .
            docker run -d first_springboot:$TAG
            '''
         }
      }
   }
}
