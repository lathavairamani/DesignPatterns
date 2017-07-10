package com.design.patterns.command;

public class RemoteControlUsingLambdaExpressions {
	
	// Lambda Expressions are meant to be used with functional interfaces, which means interface with only one method. In our case, our interface is having one method execute()
	// If we have multiple methods, we cant use lambda expressions
	CommandForLambdaExpressions[] onCommandForLambdaExpressionss;
	CommandForLambdaExpressions[] offCommandForLambdaExpressionss;

	public RemoteControlUsingLambdaExpressions() {
		onCommandForLambdaExpressionss = new CommandForLambdaExpressions[7];
		offCommandForLambdaExpressionss = new CommandForLambdaExpressions[7];

		for (int i = 0; i < 7; i++) {
			onCommandForLambdaExpressionss[i] = () -> { };
			offCommandForLambdaExpressionss[i] = () -> { };
		}
	}
	
	public void setCommandForLambdaExpressions(int slot, CommandForLambdaExpressions onCommandForLambdaExpressions, CommandForLambdaExpressions offCommandForLambdaExpressions) {
		onCommandForLambdaExpressionss[slot] = onCommandForLambdaExpressions;
		offCommandForLambdaExpressionss[slot] = offCommandForLambdaExpressions;
	}
	
	public void onButton(int slot){
		onCommandForLambdaExpressionss[slot].execute();
	}
	
	public void offButton(int slot){
		offCommandForLambdaExpressionss[slot].execute();
	}
}
