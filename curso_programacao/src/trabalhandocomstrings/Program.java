package trabalhandocomstrings;

public class Program {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); // pegar o caractere da posição 2 em diante
		String s05 = original.substring(2, 9); // pega a partir do caractere 2, abaixo do 9
		String s06 = original.replace('a', 'W');
		String s07 = original.replace("abc", "kkk");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'W'): -" + s06 + "-");
		System.out.println("replace(\"abc\", \"kkk\"): -" + s07 + "-");
		System.out.println("index Of(\"bc\"): -" + i + "-");
		System.out.println("last Index Of(\"bc\"): -" + j + "-");
		
		// split --> Serve para recortar uma string
		
		String s = "Quero fazer um curso de Spring e microserviço";
		
		String[] vetor = s.split(" "); // usa o espaço em branco como separador
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);
		System.out.println(vetor[5]);
		System.out.println(vetor[6]);
		System.out.println(vetor[7]);
	}

}
