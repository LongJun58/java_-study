public class ArrayExercise01{
	public static void main(String[] args){
		int j = 0;
		char i = 'A';
		char alphabet[] = new char[26];
		while(j < alphabet.length){
			alphabet[j] = i;
			i ++;
			j ++;
		}

		System.out.println("Ñ­»·±éÀú");
		for(j = 0;j < alphabet.length;j ++){
			System.out.print(alphabet[j] + "\t");
		}
	}
}