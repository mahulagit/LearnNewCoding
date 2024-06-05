pipeline {
    agent any

    stages {
        stage('Name') {
            steps {
                echo 'My Name Is Mahula Bhusan'
            }
        }
    }
}