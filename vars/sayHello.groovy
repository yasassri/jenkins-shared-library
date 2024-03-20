def call_my_pipeline() {
  pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
  }
}

def call() {
  call_my_pipeline()
}
