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
      
          script {
          sh 'su -'
          def output = sh(returnStdout: true, script: 'whoami')
                    echo "Output: ${output}"
          sh 'docker build --tag stevens-react-in-docker .'
          }
   
          // sh './dockerbuild.sh'
        }
      }
  }
}
