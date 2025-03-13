pipeline {
  agent any
    stages {
        stage('Build') { 
            steps {
              withMaven(maven: 'maven-3') {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
        stage('Test') {
            steps {
              withMaven(maven: 'maven-3') {
                sh 'mvn test'
            }
          }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        } 
      stage('publish') {
        agent any
        steps {
          sh 'chmod +x ./dockerbuild.sh'
          sh 'docker build --tag stevens-react-in-docker .'
          echo 'starting container'
          sh 'docker run -p 8081:8081 -p 443:443 stevens-react-in-docker'
          // sh './dockerbuild.sh'
        }
      }
  }
}
