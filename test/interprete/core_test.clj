(ns interprete.core-test
  (:require [clojure.test :refer :all]
            [interprete.core :refer :all]))


(deftest operador?-test
  (testing "prueba de la funcion operador?"
    (is (= true (operador? (symbol "+"))))
    (is (= false (operador? (symbol "%"))))) 
  )


(deftest invalidos-test
(testing "prieba de invalidos"
  (is (= (list 'IF 'X 'nil '* 'Y '< '12 'THEN 'LET 'nil 'X '= '0) (anular-invalidos '(IF X & * Y < 12 THEN LET ! X = 0)))))  
  )


