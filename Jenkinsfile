pipeline {
  agent any
    stages {
        stage('Build') { 
            steps {
               withMaven(
            // Maven installation declared in the Jenkins "Global Tool Configuration"
            maven: 'maven-3', // (1)
        ) {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
