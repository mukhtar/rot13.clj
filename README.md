# rot13

rot13.clj is a simple clojure library that implements rot13 'encryption'

## Usage

```
$ lein run "hello world"
uryyb jbeyq
```

Alternatively, create a jar with
```
$ lein uberjar
```
then run

```
$ java -jar target/rot13-0.1.0-SNAPSHOT-standalone.jar "hello world"
uryyb jbeyq
```

## License

Copyright © 2015 Mukhtar Haji

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
