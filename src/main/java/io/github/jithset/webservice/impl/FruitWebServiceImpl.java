package io.github.jithset.webservice.impl;

import io.github.jithset.domains.Fruit;
import io.github.jithset.webservice.FruitWebService;

import javax.jws.WebService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@WebService(endpointInterface = "io.github.jithset.webservice.FruitWebService")
public class FruitWebServiceImpl implements FruitWebService {
    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FruitWebServiceImpl() {
        fruits.add(new Fruit("Apple", "Winter fruit"));
        fruits.add(new Fruit("Pineapple", "Tropical fruit"));
    }

    @Override
    public Set<Fruit> list() {
        return fruits;
    }

    @Override
    public Set<Fruit> add(Fruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    @Override
    public Set<Fruit> delete(Fruit fruit) {
        fruits.remove(fruit);
        return fruits;
    }
}
