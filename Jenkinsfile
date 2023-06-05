pipeline {
    agent any

    stages {
        stage('clean') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                bat "mvn clean test"
            }

            post {
                always{
                    script{
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                    ])
                    }
                }
            }
        }

    }
}