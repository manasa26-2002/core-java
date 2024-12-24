class TrainingBatch{
  int noOfTrinees;
  String batchName;
  String trainerName;
  String instituteName;
  
  public TrainingBatch(){
	  System.out.println("batch constructor is invoked");
  }
  
  public TrainingBatch( int nt , String bN , String tn , String iN){
	  noOfTrinees = nt;
	  batchName = bN;
	  trainerName = tN;
	  instituteName = iN;
  }
  
  public void displayTrainingBatchDetails(){
	  System.out.println("the training batch of noOfTrinees are:"+noOfTrinees);
	  System.out.println("the training batch of batchName is:"+batchName);
	  System.out.println("the training batch of trainerName are:"+trainerName);
	  System.out.println("the training batch of instituteName is:"+instituteName);
  }
}