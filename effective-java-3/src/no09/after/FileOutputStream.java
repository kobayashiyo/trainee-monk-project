package no09.after;

class FileOutputStream implements AutoCloseable{

	private String name;

	public FileOutputStream(String name) {
		this.name = name;
	}

	public void write() {
		System.out.println("call FileOutputStream#write : " + this.name);
		throw new RuntimeException();
	}


	@Override
	public void close() {
		System.out.println("call FileOutputStream#close : " + this.name);
		throw new RuntimeException();
	}

}
