public void finishedExecuting(AST ast, Object result, IEolContext context) {
    if (ast.getType() == EolLexer.PARAMETERS && ast.getParent() != null)
        ast.getParent().setVisited();
    else
        ast.setVisited();
}