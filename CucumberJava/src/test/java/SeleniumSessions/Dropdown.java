package SeleniumSessions;

public enum Dropdown {

	INDEX{
		@Override
		public String toString() {
			return "Index";
		}
	},
	
	VALUE{
		@Override
		public String toString() {
			return "value";
		}
	},
	
	VISIBLETEXT{
		@Override
		public String toString() {
			return "text";
		}
	}
	
}
