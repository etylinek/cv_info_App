<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>
<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Education-->
    <section class="resume-section" id="education">
        <div class="resume-section-content">
            <h2 class="mb-5">Education</h2>
            <c:forEach items="${educationModel}" var="example">
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                    <div class="flex-grow-1">
                        <h3 class="mb-0">${example.academic}</h3>
                        <div class="subheading mb-3">${example.academicTitle}</div>
                        <div>${example.specialization}</div>
                        <p>GPA: ${example.score}</p>
                    </div>
                    <div class="flex-shrink-0"><span
                            class="text-primary"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${example.dateStart}" /> - <fmt:formatDate pattern = "yyyy-MM-dd" value = "${example.dateEnd}" /></span></div>
                </div>
            </c:forEach>

            <a href='<c:url value="/edu/addEducation"/>' class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
                <span class="text">Dodaj nowy wpis</span>
            </a>
        </div>
    </section>
</div>


<%@include file="../dynamic/footer.jspf" %>
</body>
</html>
