pipeline {
  agent any
    stages {
        stage('Build') { 
            steps {
               withMaven(
                 maven: 'maven-3'
        ) {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}

}
