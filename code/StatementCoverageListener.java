public class StatementCoverageListener implements IExecutionListener {

	@Override
	public void aboutToExecute(AST ast, IEolContext context) {		
	}
	
	@Override
	public void finishedExecuting(AST ast, Object result, IEolContext context) {
		ast.setVisited();
	}
}
