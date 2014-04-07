public void analyseCoverage() {
    this.readInLines();
    this.fillCoveredArray();
    this.dfAST(ast);
    BufferedWriter writer = null;

    try {
        writer = new BufferedWriter(new FileWriter(targetFile));
        this.outputHTMLHeader(writer);
        this.outputTitle(writer);
        this.outputCoverageStats(writer);
        this.ouputEOLFile(writer);
        this.ouputHTMLFooter(writer);
        writer.flush();
        writer.close();
    }
    catch (IOException e) {
        // Not much to do here, just output stack trace
        e.printStackTrace();
    }
}