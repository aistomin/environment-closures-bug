This project illustrates the problem with using this ```Config.groovy``` code:

```
environments {
    test {
        // do something
    }
}
```

I'm using integration tests + ```grails.project.fork``` with daemon. The problem
is that ```environments.test``` closure is called not every time when ```environments```
closure is called.

Although, everything works as expected with this construction:

```
environments {
    if(Environment.current.equals(Environment.TEST)) {
        // do something
    }
}
```

I have create class ```com.test.Counter``` that holds numbers of closure calls
for both situation. Expected behaviour is that ```environments``` and ```environments.test```
closures was called the same times count during the test.

Running tests: ```grails test-app -Duse.closure=true``` we use example code #1 and test fails.
Running tests: ```grails test-app``` we use example code #2 and test passes.
