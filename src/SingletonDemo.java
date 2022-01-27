class SingletonDemo {

	private SingletonDemo() {
	}

	public static SingletonDemo singletonDemoObject;

	public static SingletonDemo getSingletonDemoObject() {
		if (singletonDemoObject == null) {
			synchronized (SingletonDemo.class) {
				singletonDemoObject = new SingletonDemo();
			}

		}
		return singletonDemoObject;

	}

	public static void main(String...args) {
		
		System.out.println(SingletonDemo.getSingletonDemoObject());
		System.out.println(SingletonDemo.getSingletonDemoObject());
		System.out.println(SingletonDemo.getSingletonDemoObject());
		System.out.println(SingletonDemo.getSingletonDemoObject());

	}

}
