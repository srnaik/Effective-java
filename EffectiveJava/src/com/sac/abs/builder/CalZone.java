package com.sac.abs.builder;

public class CalZone extends Pizza {
	private final boolean sauceInside;
	
	public static class Builder extends Pizza.Builder<Builder>{
		private boolean sauceInside;
		
		public Builder sauceInide() {
			this.sauceInside = true;
			return this;
		}

		@Override
		public Pizza build() {
			return new CalZone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}

	public CalZone (Builder builder) {
		super(builder);
		this.sauceInside = builder.sauceInside;
	}
	
	

}
