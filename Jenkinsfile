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
        steps {
          sh 'chmod +x ./dockerbuild.sh'
          sh 'chmod 777 ./dockerbuild.sh'
          sh 'su root'
          sh 'whoami'
          sh './dockerbuild.sh'
        }
      }
  }
}
