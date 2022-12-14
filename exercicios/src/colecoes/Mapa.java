package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");	
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		
		System.out.println(usuarios.containsKey(7));
		
		//usuarios.clear(); limpar
		System.out.println(usuarios.size());
			
		System.out.println(usuarios.get(1));
		System.out.println(usuarios.get(2));
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Ricardo"));
		
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.remove(4,"Gui"));
		System.out.println(usuarios.remove(5));
		
		//percorrendo chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorrendo valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//percorrendo chave valor
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.println(usuario.getKey() + " " + usuario.getValue());
		}
	}
}
