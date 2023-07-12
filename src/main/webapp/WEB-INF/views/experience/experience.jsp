<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>
        <!-- Page Content-->
        <div class="container-fluid p-0">
            <!-- Experience-->
            <section class="resume-section" id="experience">
                <div class="resume-section-content">
                    <h2 class="mb-5">Experience</h2>
                    <c:forEach items="${experienceModel}" var="example">
                    <div class="d-flex flex-column flex-md-row justify-content-between mb-5">



                        <div class="flex-grow-1">
                            <h3 class="mb-0">${example.position} </h3>
                            <div class="subheading mb-3">${example.company}</div>
                            <p>${example.description}</p>
                        </div>
                        <div class="flex-shrink-0"><span class="text-primary"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${example.dateStart}" /> - <fmt:formatDate pattern = "yyyy-MM-dd" value = "${example.dateEnd}" /></span></div>

                            <div><a href='<c:url value="/exp/editExperience/${example.id}"/>'
                                   class="btn-right btn btn-primary" role="button">Edytuj</a>
                            </div>

                    </div>

                    </c:forEach>

                    <a href='<c:url value="/exp/addExperience"/>' class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
                        <span class="text">Dodaj nowy wpis</span>
                    </a>
                </div>
            </section>
        </div>


<%@include file="../dynamic/footer.jspf"%>
    </body>
</html>
