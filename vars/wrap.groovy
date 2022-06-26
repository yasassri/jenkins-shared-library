def call(Closure body) {
        echo "in the wrapper"
        printf(body)
        //println(body.getProperty('imageName'))
        //body()
}