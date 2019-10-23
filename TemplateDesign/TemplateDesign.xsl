<?xml version="1.0" encoding="UTF-8"?> 
<xsl:stylesheet version="1.0" 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/xhtml"> 
  <!-- <xsl:output method="xml" indent="yes" encoding="UTF-8"/> -->
<xsl:template match="/"> 
 <html> 

<style type="text/css">
.content {
  background-color: #f0d0d0;
  border: 6px solid orange;
  color: #000000;
  padding: 8px;
  position: absolute;
  left: 300px;
  top: 70px;
  width: 60%;
  height:60%;
}

.content p{
 text-decoration: none;
        display: block;
        text-align: left;
        font-size: 26px;
        color: blue;
        padding-top:30px;
        padding-left:40px;
        }
    #text{
        text-align: left;
        font-size: 20px;
        color: green;
        padding-top:70px;
        }

        #texts{
        text-align: left;
        font-size: 20px;
        color: red;
        padding-top:10px;
        }

         #text1{
        text-align: left;
        font-size: 20px;
        color: green;
        padding-top:2px;
        }


</style>

 
 <body> 
  <h1 align="center" color="orange">BIRTHDAY WISH TEMPLATE</h1> 

  <div class="content">
  <!-- <img src="p.jpg" height="30" width="20"> -->
  <span>HI.......</span>
  <p id="texts">Parvati..</p>
  <p>WISH YOU VERY HAPPY BIRTHDAY STAY BLESSED KEEP SMLING...</p>
   
  <p id="text">Did you know that Sachin Tandlukar was also born on this day...</p>
  <p id="text1">Today is World's Student Day....</p>
  
  </div>

  <!-- <div class="content2"> -->
  <!-- </div> -->
   <!-- <table border="3" align="center" > 
   <tr> 
    <th>Name</th> 
    <th>DOB</th> 
    <th>Age</th> 
    <th>wish</th> 
   </tr> 
    <xsl:for-each select="Wishes/person"> 
   <tr> 
    <td><xsl:value-of select="name"/></td> 
    <td><xsl:value-of select="DOB"/></td> 
    <td><xsl:value-of select="age"/></td> 
    <td><xsl:value-of select="wish"/></td> 
   </tr> 
    </xsl:for-each> 
    </table>  -->
</body> 
</html> 
</xsl:template> 
</xsl:stylesheet> 