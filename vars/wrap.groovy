def call(Closure body) {
        echo "in the wrapper"
        body()
}