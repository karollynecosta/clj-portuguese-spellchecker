# Clojure Portuguese Spellchecker

This project intends to provide a simple spellchecker for the Portuguese language.


## Examples

```clojure
lein repl
clj-portuguese-spellchecker.core=> (load-file "src/clj_portuguese_spellchecker/core.clj")
#'clj-portuguese-spellchecker.core/-main
clj-portuguese-spellchecker.core=> (-main "pexxe")
Voce quis dizer peixe ?
nil
clj-portuguese-spellchecker.core=> exit

```