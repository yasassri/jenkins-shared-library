@NonCPS
def call(def body) {
        echo "in the wrapper"
        println(imageName)
        println(body.getProperty('imageName'))
        //body()
}