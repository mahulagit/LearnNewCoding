pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Taylor Swift is shit'
            }
        }
    }
}
