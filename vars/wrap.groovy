def call(Closure body) {
        echo "in the wrapper"
        println(body.getMaximumNumberOfParameters())
        //println(body.getProperty('imageName'))
        //body()
}