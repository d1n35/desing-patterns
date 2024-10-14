package one.di.gof.Singleton;

/**
 * Singleton preguiçoso/Lazy
 * Ele vai fazer toda uma verificação para ver se ela existe para ai sim fazer a instancia
 * @author d1n35
 */
public class SingletonPreguicoso {
    private static SingletonPreguicoso instancia;

    private SingletonPreguicoso(){
        super();
    }

    public static SingletonPreguicoso getInstancia(){
        if (instancia == null) {
            instancia = new SingletonPreguicoso();
        }
        return instancia;
    }
}
