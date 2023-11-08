let ids=[[1,2,3],[4,5,6]]
for(var i=0;i<=ids.length-1;i++)
{
    for(var j=i;j<=i;j++)
    {
        console.log(ids[j])
    }
}
for(id of ids)
{
    for(a of id)
    {
        console.log(a)
    }
}
