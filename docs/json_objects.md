<h1>Tansaction Report</h1>

```
type Tx = {
    date: Date
    product: string
    affiliate: string
    coupon: string
    txn: string
    status: string
    amount: number
    funnel: string
}
```

<h2>Transaction Totals</h2>

```
type TxTotals = {
   totalSales: number, 
   grossIncome: number, 
   totalRefunds: number, 
   grossRefunds: number,
   refundRate: number,
   netSales: number, 
   netIncome: number
}
```

<h1>Paid to Affiliate Report</h1>

```
type PdAffiliate = {
    affiliate: string,
    sales: string,
    amtPaid: string,
    date: Date
}
```

<h2>Paid to Affiliates Totals</h2>

```
type PdAffiliateTotals = {
  totalSales: number,
  amountPaid: number, 
}
```

<h1>Sales Report</h1>

```
type Sales = {
    affiliate: string,
    product: string,
    visitors: number, 
    sales: number, 
    conversions: string, 
    perVisitor: string, 
    perSale: string, 
    total: string
}
```

<h2>Sales Totals</h2>

```
type SalesTotals = {
  visitors: string, 
  sales: number, 
  conversions: number, 
  perVisitor: number, 
  perSale: number, 
  total: number
}
```

<h1>PreApprovals Report</h1>

```
type PreApprovals = {
    product: string,
    affiliate: string,
    email: string, 
    currMax: string,
    current: number, 
    status: string, 
    nextDate: Date,
}
```

<h1>PreApproval Failures Report</h1>h

```
type PreApprovalFailure = {
    typeReason: string, 
    numberOfFailures: number,
}
```

<h1>PreApprovals Forecast Report</h1>

```
type PreApprovalForecast = {
    product: string
    subscriptions: number
    total: number
}
```

<h2>PreApprovals Forecast Totals </h2>

```
type PreApprovalForecastTotals = {
  thirtyDay: number
  sixtyDay: number
  oneEightyDay: number
  threeSixtyFiveDay: number
}
```

<h1>VAT Transaction Report</h1>

```
type VatTransaction = {
    vendorCountry: string, 
    date: Date, 
    txn: string, 
    name: string, 
    ip_address: string, 
    subTotal: number, 
    taxCollected: number
}
```
