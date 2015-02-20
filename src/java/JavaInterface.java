public interface JavaInterface {
	class NestedInInterface {
		public String nestedMethod() {
			return "foo";
		}
	}

	public NestedInInterface someMethod();
}