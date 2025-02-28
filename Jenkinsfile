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
  }
  
}
