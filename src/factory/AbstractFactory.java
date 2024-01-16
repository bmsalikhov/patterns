package factory;

interface AbstractFactory<T> {
    T create(String type);
}
