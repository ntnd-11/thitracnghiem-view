<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<t:WrapperAdmin>
                <div class="row ">
                    <div class="col-md-4">
                        <div class="card card-user">
                            <div class="row justify-content-center my-2">
                                <div class="col-lg-10">
                                    <input type="number" class="form-control" placeholder="Số Câu Hỏi">
                                </div>

                            </div>
                            <div class="row justify-content-center">
                                <div class="col-md-10">
                                    <div class="card card-user border">
                                        <div class="card-header">
                                            <h4 class="card-title text-center"> Loại câu hỏi</h4>
                                        </div>
                                        <div class="col-md-12">
                                            <div class="row justify-content-center ">
                                                <div class="col-md-4">
                                                    <div class="form-group justify-content-center text-center">
                                                        <input type="number" class="form-control" value="" name="easy" id="easy">
                                                        <p>Dễ</p>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group justify-content-center text-center">
                                                        <input type="number" class="form-control" value="" name="normal" id="normal">
                                                        <p>TB</p>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group justify-content-center text-center">
                                                        <input type="number" class="form-control" value="" name="difficult" id="difficult">
                                                        <p>Khó</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row justify-content-center ">
                                            <div class="form-group justify-content-center text-center">
                                                <input type="text" class="form-control" value="" disabled>
                                                <p>Tổng số câu hỏi</p>
                                            </div>
                                            
                                        </div>
                                        
                                    </div>
                                    <button type="button"  class="btn btn-primary btn-round" id="btnCreateExam">Tạo ngẫu nhiên</button>
                                </div>
                            </div>
                            
                        </div>
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title"><b>Tùy Chọn</b></h4>
                            </div>
                            <div class="card-body">
                                <ul class="list-unstyled ">
                                    <li>
                                        <div class="mb-1">
                                            <input type="datetime-local" class="form-control" placeholder="Thời Gian Mở">
                                        </div>
                                    </li>
                                    <li>
                                        <div class="mb-1">
                                            <input type="datetime-local" class="form-control" placeholder="Thời Lượng">
                                        </div>
                                    </li>
                                    <li>
                                        <select name="sltCourse" class="form-control">
                                        <option value ='-1'> Chọn lớp </option>
                                        </select>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="card card-user">
                            <div class="card-header">
                                <h5 class="card-title">Danh Sách Câu Hỏi</h5>
                            </div>
                            <div class="card-body">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Stt</th>
                                            <th>Nội Dung</th>
                                            <th>Đáp án</th>
                                            <th class="text-center">Lựa Chọn</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <c:forEach items="${lstCurrentQuestion}" var="question" varStatus="loop">
                                    
	                                        <tr id= "frameQuestion_${loop.index}" >
	                                            <td> ${question.questionId } </td>
	                                            <td>
	                                            	 <select class="form-control">
	                                            		<option selected value=" ${question.questionId} "> ${ question.question }<option>
	                                            	</select>
	                                            </td>
	                                            <td>
	                                            	<c:forEach items="${question.lsAnswer}" var="ans">
														<c:if test="${question.correctAnswerID == ans.id}">
															<p>
																<b>${ ans.answer }</b>
															</p>
														</c:if>
														<c:if test="${  question.correctAnswerID != ans.id}">
															<p>${ ans.answer }</p>
														</c:if> 
													</c:forEach>
	                                            </td>
	                                            <td class="text-center">
	                                            	<button type="button" class="btn btn-danger" id="btnDelete"
	                                            			data-id=">${ question.questionId }"
	                                            			data-index="${loop.index}">
	                                            		<i class="fa fa-trash" style="font-size:10px"></i>
	                                            	</button>
	                                            </td>
	                                        </tr>
										</c:forEach>
                                    </tbody>
                                </table>
                                <nav aria-label="Page navigation example" class="float-right">
                                    <ul class="pagination">
                                        
                                        <c:forEach var="i" begin="1" end="${numberPage}">
											<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/AddExam?page=${i}">${i}</a>
											</li>
										</c:forEach>
										
										<li class="page-item"><a class="page-link" href="#">Next</a></li>
										
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>

                
                 <button type="submit" class="btn btn-primary btn-round float-right"> Tạo Đề Thi </button>
            	</div>
<script>
         	$(document).ready(function() {
	   			$('#btnCreateExam').click(function(){
					var difficult = $('#difficult').val();
					var normal = $('#normal').val();
					var easy = $('#easy').val();
					if(difficult == "" ||normal == "" ||easy == "")
						alert("Xin vui lòng nhập số lượng câu hỏi từng loại");
					else	
						{
						 	var link = '/WebThi/AddExam?difficult='+difficult+'&normal='+normal+'&easy='+easy;
							window.location=link;
						}
	   			});
	   			$('#btnDelete').click(function(){
					var index = $(this).data("index");
					deleteQuestion(index);
	   			});

   			});
         	
         	function deleteQuestion(indexQuestion)
         	{
         		$.ajax({
					url : '${pageContext.request.contextPath}/AddExam?deleteIndex='+indexQuestion,
					type:'DELETE',
				    contentType: "json",
				    success : function(data) {
				    	$("#frameQuestion_"+indexQuestion).remove();
				    	alert("Xóa thành công!");
				    }
         		});
         	}
</script>
</t:WrapperAdmin>
            

