pipeline {
    agent any
    stages {
        stage('Build') { 
            withMaven(maven: 'mvn') 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
