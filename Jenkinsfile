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
                        sh 'docker-compose -f docker-compose-v3-video.yml up -d'
                    }
                }
           stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }
       
        stage('Run test') {
            steps {
                sh 'mvn test -DbrowserName=chrome'
            
            }

       }
     stage('stop and remove dockers') {
            steps {
                sh 'docker stop $(docker ps -a -q)'
                sh 'docker rm $(docker ps -a -q)'
                        }
    }
}
}
