def myFunc(){
    pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World 5555'
            }
        }
    }
}
  
}

def call() {
  myFunc()
}

return this

// def call_my_pipeline() {
//   pipeline {
//     agent any
//     stages {
//         stage('Hello') {
//             steps {
//                 echo 'Hello World'
//             }
//         }
//     }
//   }
// }

// def call() {
//   call_my_pipeline()
// }
