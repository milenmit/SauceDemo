pipeline {
    agent any

    stages {
        stage('Pull latest code') {
            steps {
                git 'https://github.com/milenmit/SauceDemo.git'
            }
        }
         stage('Spinning up dockers') {
                    steps {
                        sh 'docker-compose up -d'
                    }
                }
           stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Run test') {
            steps {
                sh 'mvn test'
            }

       }
     stage('stop and remove dockers') {
            steps {
                sh 'docker stop $(docker ps -a q)'
                sh 'docker rm $(docker ps -a q)'
                        }
    }
}
