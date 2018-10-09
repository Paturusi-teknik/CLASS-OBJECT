package patur;

public class main {

	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(10.12);
		main.setlebar(5.08);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Paturusi";
		mahasiswa.nim = "D0217330";
		mahasiswa.alamat = "Wonomulyo";
		mahasiswa.golonganDarah = "";
		mahasiswa.status = "Mahasiswa";
		mahasiswa.tinggiBadan = "160";
		mahasiswa.beratBadan = "50";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "Scoopy";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "Paturusi";
		stack.value[1] = "aswad";
		stack.value[2]= "udin";
		stack.value[3]= "sadly";
		stack.value[4]= "subhan tarman";
		stack.value[5]= "rian";
		stack.value[6]= "reny";
		stack.value[7]= "paulo";
		stack.value[8]= "muli";
		stack.value[9]= "yuli";
		stack.value[10]= "marwah";
		stack.value[11]= "muhammad mohar";
		stack.value[12]= "jenjaka";
		stack.value[13]= "kamaria";
		stack.value[14]= "arnoldus renaldi";
		stack.value[15]= "m jaimuddin";
		stack.value[16]= "jumardi";
		stack.value[17]= "lenon";
		stack.value[18]= "nurli";
		stack.value[19]= "sayyidah";
		stack.value[20]= "mariani";
		stack.value[21]= "intan";
		stack.value[22]= "mario";
		stack.value[23]= "maria";
		stack.value[24]= "janet";
		stack.value[25]= "comen";
		stack.value[26]= "ayu";
		stack.value[27]= "tiwi";
		stack.value[28]= "aqua";
		stack.value[29]= "mineral";
		stack.value[30]= "puang";
		stack.value[31]= "kelay";
		stack.value[32]= "sari";
		stack.value[33]= "dani";
		stack.value[34]= "sultan";
		stack.value[35]= "ilyas";
		stack.value[36]= "rasjan";
		stack.value[37]= "fadly";
		stack.value[38]= "khaliq";
		stack.value[39]= "iqbal";
		stack.value[40]= "ikbal";
		stack.value[41]= "aqil";
		stack.value[42]= "idil";
		stack.value[43]= "sukran";
		stack.value[44]= "bambang";
		stack.value[45]= "jacki";
		stack.value[46]= "sitti";
		stack.value[47]= "nanda";
		stack.value[48]= "madina";
		stack.value[49]= "rajab";
		stack.value[50]= "hasan";
		stack.value[51]= "husain";
		stack.value[52]= "opik";
		stack.value[53]= "agus";
		stack.value[54]= "dandi";
		stack.value[55]= "andi";
		stack.value[56]= "ulfa";
		stack.value[57]= "paisal";
		stack.value[58]= "alifah ariani";
		stack.value[59]= "kanda";
		stack.value[60]= "iksan";
		stack.value[61]= "bani";
		stack.value[62]= "doni";
		stack.value[63]= "tarra";
		stack.value[64]= "manda";
		stack.value[65]= "fitri";
		stack.value[66]= "ratna";
		stack.value[67]= "ahmad";
		stack.value[68]= "budi";
		stack.value[69]= "adi";
		stack.value[70]= "eko";
		stack.value[71]= "jokowi";
		stack.value[72]= "yusuf";
		stack.value[73]= "sosilo";
		stack.value[74]= "mandra";
		stack.value[75]= "mandar";
		stack.value[76]= "bujang";
		stack.value[77]= "bang";
		stack.value[78]= "dina";
		stack.value[79]= "farhan";
		stack.value[80]= "koni";
		stack.value[81]= "bakku";
		stack.value[82]= "made";
		stack.value[83]= "agustina";
		stack.value[84]= "setiawan";
		stack.value[85]= "rizky";
		stack.value[86]= "rini";
		stack.value[87]= "gazli";
		stack.value[88]= "all";
		stack.value[89]= "kenji";
		stack.value[90]= "arulk";
		stack.value[91]= "cimmank";
		stack.value[92]= "zibri";
		stack.value[93]= "lay";
		stack.value[94]= "corci";
		stack.value[95]= "mia";
		stack.value[96]= "camba";
		stack.value[97]= "lesley";
		stack.value[98]= "fani";
		stack.value[99]= "harley";
		
		stack.setvalueAt(1 ,"patur");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};


	}

}

