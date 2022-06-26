def call(Closure body) {
        echo "in the wrapper"
        println(body)
        println(body.getProperty('imageName'))
        //body()
}