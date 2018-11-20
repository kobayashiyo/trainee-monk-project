package no09.before;

class FileInputStream implements MyClosable{

	private String name;

	public FileInputStream(String name) {
		this.name = name;
	}

	public void read() {
		System.out.println("call FileInputStream#read : " + this.name);
		throw new RuntimeException();
	}


	@Override
	public void close() {
		System.out.println("call FileInputStream#close : " + this.name);
		throw new RuntimeException();
	}

}
